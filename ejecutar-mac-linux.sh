#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
mkdir -p out
javac -encoding UTF-8 -d out src/ejercicios/EjerciciosJava.java src/menu/MenuPrincipal.java
java -cp out menu.MenuPrincipal
