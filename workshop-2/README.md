# WORKSHOP 2

## To compile

You must execute this command under the `workshop-2` directory.

```bash
javac -d out \
--module-source-path jug-istanbul/src/ \
$(find . -name "*.java")
```
Or

```bash
sh compile.sh
```

## To create jars

You must execute this command under the `workshop-2` directory.

```bash
jar --create --file module1.jar \
--main-class jugistanbul.workshop2.module1.Module1 \
-C out/jugistanbul.workshop2.module1 .

jar --create --file module2.jar \
--main-class jugistanbul.workshop2.module2.Module2 \
-C out/jugistanbul.workshop2.module2 .
```
Or

```bash
sh create-jars.sh
```
