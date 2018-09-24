# WORKSHOP 1

# To compile

You must execute this command under the workshop-1 directory.

```bash
javac --module-path mods \
-d mods/IstanbulJUG \
$(find jugistanbul-slugifier/src/main/ -name "*.java")
```
Or

```bash
sh compile.sh
```

# To run

You must execute this command under the workshop-1 directory.

```bash
java --module-path mods \
--module jugistanbul.slugifier/jug.istanbul.slugifier.Slugifier "Hello from İstanbul Jug"
```
Or

```bash
sh run.sh
```

