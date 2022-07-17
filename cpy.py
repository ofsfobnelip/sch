import shubhlipi as sh
import markdown
import os
if len(sh.argv) == 0:
    print("Specify Drive letter")
    exit(-1)
elif len(sh.argv[0]) != 1:
    print("Invalid Drive letter")
    exit(-1)
lc = f'{sh.argv[0]}:\\जावोपानुप्रयोगानि'
sh.delete_folder(lc)
sh.makedir(lc)
frm = sh.parent(__file__)
for x in os.listdir("./"):
    if x[-6:] == ".class" or x in [".git"]:
        continue
    sh.copy_file(x, lc+f"\\{x}")
sh.write(lc+"\\README.html", markdown.markdown(sh.read("README.md")))
print("Succesfully Copied")


"""
import shubhlipi as sh
import re
import os
f = sh.read("README.md")
inner = f.split("## ")[1:]
header = [x.split("\n")[0] for x in inner]
exp = re.compile(r'\(\S+\.java\)')
for x in inner:
    i = inner.index(x)+1
    all = exp.findall(x)
    if os.path.isdir(str(i)):
        sh.delete_folder(str(i))
    sh.makedir(str(i))
    for y in all:
        nm = y[3:-1]
        p = sh.read(nm)
        sh.write(f'{i}\\{nm}', p)
        sh.delete_file(nm)
        f = f.replace(y, f'(./{i}/{nm})')
sh.write('README.md', f)

"""