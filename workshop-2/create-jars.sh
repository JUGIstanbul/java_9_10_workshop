#!/usr/bin/env bash
jar --create --file module1.jar \
--main-class jugistanbul.workshop2.module1.Module1 \
-C out/jugistanbul.workshop2.module1 .

jar --create --file module2.jar \
--main-class jugistanbul.workshop2.module2.Module2 \
-C out/jugistanbul.workshop2.module2 .