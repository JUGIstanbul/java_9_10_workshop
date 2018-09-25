# WORKSHOP 3

## To compile

You must execute this command under the `workshop-3` directory.

```bash
javac -d mods \
--module-source-path jugistanbul/src \
$(find . -name "*.java")
```
Or

```bash
sh compile.sh
```

## To run

You must execute this command under the `workshop-3` directory.

```bash
java --module-path mods \
--module jugistanbul.calc.app/jugistanbul.calc.app.Calculator
```
Or

```bash
sh run.sh
```
