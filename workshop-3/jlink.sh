#!/usr/bin/env bash
#You must set the following paths according to your own system
export jLink="/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jlink"
export jMods="/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/jmods"

$jLink \
--module-path $jMods:mods \
--add-modules jugistanbul.calc.app \
--limit-modules jugistanbul.calc.app \
--launcher calc=jugistanbul.calc.app/jugistanbul.calc.app.Calculator \
--output myJlink

myJlink/bin/calc