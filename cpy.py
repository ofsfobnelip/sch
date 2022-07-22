import shubhlipi as sh
import markdown
import markdown.extensions.fenced_code
from markdown.extensions.toc import TocExtension
import os
from pygments.formatters import HtmlFormatter
if len(sh.argv) == 0:
    print("Specify Drive letter")
    exit(-1)
elif len(sh.argv[0]) != 1:
    print("Invalid Drive letter")
    exit(-1)
lc = f'{sh.argv[0]}:\\जावोपानुप्रयोगानि'
sh.delete_folder(lc)
sh.makedir(lc)

css_string = (
    f'<style>{HtmlFormatter(style="emacs", full=True,cssclass="codehilite").get_style_defs()}' +
    '.mama pre{margin:0;}'
    '.mama{border: 2px solid red;padding:10px;font-size:17px;border-radius:10px;}'
    '</style>'
)


def markdowninfy(vl: str) -> str:
    return markdown.markdown(
        vl, extensions=['codehilite', 'fenced_code', TocExtension(permalink=True)])


def beautify_code(lc, code):
    return markdowninfy(f'<style>{css_string}</style>[Here](./src/{lc})\n<div class="mama">\n```java\n{code}\n```\n</div>')


frm = sh.parent(__file__)
for x in os.listdir("./"):
    if x[-6:] == ".class" or x in [".git"]:
        continue
    if os.path.isfile(x):
        sh.copy_file(x, lc+f"\\{x}")
    elif os.path.isdir(x):
        sh.makedir(lc+f"\\{x}\\src")
        for y in os.listdir(x):
            if y in ["c.py"]:
                continue
            vl = sh.read(f'{x}\\{y}')
            sh.write(f"{lc}\\{x}\\src\\{y}", vl)
            sh.write(
                f"{lc}\\{x}\\{y.split('.')[0]}.html", beautify_code(y, vl))

sh.write(
    lc+"\\README.html",
    "<style>.headerlink{margin-left:10px;font-size:18px;text-decoration:none;}</style>" +
    markdowninfy(sh.read("README.md").replace(".java)", ".html)"))
)
print("Succesfully Copied")
