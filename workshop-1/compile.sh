#!/usr/bin/env bash
javac --module-path mods \
-d mods/IstanbulJUG \
$(find jugistanbul-slugifier/src/main/ -name "*.java")