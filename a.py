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
        f=f.replace(y,f'(.{i}/{nm})')
