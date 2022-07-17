import shubhlipi as sh
# download shubhlipi.py from https://shubhlipi.deta.dev/files/shubhlipi.py
import os
if len(sh.argv) == 0:
    exit()
nm = sh.argv[0]
if not os.path.isfile(f"{nm}.java"):
    print(nm+".java not found")
    exit()
sh.cmd(f"javac {nm}.java", direct=False)
pth = nm.split('/')
sh.start_thread(lambda: sh.cmd(
    f"cd {'/'.join(pth[:-1])}\njava {pth[-1]}", file=True))
sh.sleep(1.5)
sh.delete_file(f"{nm}.class")
