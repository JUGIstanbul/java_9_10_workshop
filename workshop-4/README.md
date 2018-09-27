# WORKSHOP 4

## To compile

You must execute this command under the `workshop-4` directory.

```bash
javac -d mods \
--module-source-path src/ \
$(find . -name "*.java")
```
Or

```bash
sh compile.sh
```

## To run

You must execute this command under the `workshop-4` directory.

```bash
java --module-path mods \
--module jugistanbul.iot.app/jugistanbul.iot.app.Main
```
Or

```bash
sh run.sh
```
