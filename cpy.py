import shubhlipi as sh
import markdown
import os
if len(sh.argv) == 0:
    print("Specify Drive letter")
    exit(-1)
elif len(sh.argv[0]) != 1:
    print("Invalid Drive letter")
    exit(-1)
lc = f'{sh.argv[0]}:\\जावानुपानिप्रयोगानि'
sh.delete_folder(lc)
sh.makedir(lc)
frm = sh.parent(__file__)
for x in os.listdir("./"):
    if x in [".git"]:
        continue
    sh.copy_file(x, lc+f"\\{x}")
sh.write(lc+"\\README.html", markdown.markdown(sh.read("README.md")))
