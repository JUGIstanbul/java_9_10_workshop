#!/usr/bin/env bash
javac -d mods \
--module-source-path jugistanbul/src \
$(find . -name "*.java")