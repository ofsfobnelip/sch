import shubhlipi as sh
import os
if len(sh.argv) == 0:
    exit()
nm = sh.argv[0]
if not os.path.isfile(nm+".java"):
    print(nm+".java not found")
    exit()
sh.cmd(f"javac {nm}.java", direct=False)
sh.cmd(f"java {nm}", direct=False)
sh.delete_file(nm+".class")
