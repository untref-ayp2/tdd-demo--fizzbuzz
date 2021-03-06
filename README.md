# tdd-demo

Una demostración del flujo de trabajo con TDD (Test-Driven Development), combinado con el uso de "recetas de software".

Material complementario a la Clase de TDD "[Algoritmos y Programación II](https://sites.google.com/untref.edu.ar/aypii/)", de la [Ingeniería en Computación](http://www.untref.edu.ar/carrera/ingenieria-en-computacion) de la [UNTREF](https://untref.edu.ar).


## Descargar

https://github.com/untref-ayp2/tdd-demo


## Uso

<!--
[Video de la clase en YouTube](TBD). (Licencia: [CC-BY](https://creativecommons.org/licenses/by/4.0/)).
-->

La resolución se encuentra en la rama 'resolucion-paso-a-paso'.
Se recomienda seguir el desarrollo con alguna herramienta como [Git-Time-Machine](https://github.com/littlebee/git-time-machine).

[Guías de referencia rápida de recetas de software en este repo](doc/)

Nota: El problema utilizado como ejemplo es expresamente trivial, puesto que el objetivo de la clase es focalizarse en el proceso y el uso de las herramientas del lenguaje y el entorno.


## Problema de ejemplo

Escriba una función que devuelva los primeros 100 números de la secuencia del siguiente juego de niños.

### “Fizz Buzz”

Los jugadores generalmente se sientan en un círculo. El primer jugador / La primera jugadora dice el número "1", y el resto va contando hacia arriba, de a un número por persona, con las siguientes salvedades:
- cualquier número divisible por 3 se convierte en la palabra “Fizz”,
- cualquier número divisible por 5 se convierte en la palabra “Buzz”,
- cualquier número divisible por 15 se convierte en la palabra “Fizz Buzz”.
- el resto de los números se recitan normalmente.
- Quien dude o cometa un error es eliminade del juego, hasta que sólo quede una persona (quien es declarada ganadora).

Una ronda típica de “Fizz Buzz” comenzaría de la siguiente manera:
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

*Traducido de https://en.wikipedia.org/wiki/Fizz_buzz*


## Referencias

“How to Design Programs - An Introduction to Programming and Computing (2nd Ed.)”
(Cómo Diseñar Programas – Una Introducción a Programación y Computación, 2da. Ed.). Matthias Felleisen,
Robert Bruce Findler, Matthew Flatt & Shriram Krishnamurthi. Publicado por MIT Press. Edición en papel: ISBN:
9780262534802 (2018). Edición digital disponible gratuitamente en https://htdp.org

“How to Design Classes - Data: Structure and Organization (June 15 2012 draft)” (Cómo
Diseñar Clases – Datos: Estructura y Organización, Borrador del 15 de Junio de 2012). Matthias Felleisen,
Matthew Flatt, Robert Bruce Findler, Kathryn E. Gray, Shriram Krishnamurthi & Viera K. Proulx.
Versión digital disponible gratuitamente en https://felleisen.org/matthias/htdc.html


Ciclo de desarrollo conducido por pruebas (TDD)
https://es.wikipedia.org/wiki/Desarrollo_guiado_por_pruebas#Ciclo_de_desarrollo_conducido_por_pruebas_TDD


## Licencia

Copyleft © 2021, Leandro Doctors.

Este programa es Software Libre: puede redistribuirse y/o modificarse
bajo los términos de la Licencia Apache, ya sea la versión 2 de la Licencia, o
(a libre elección) cualquier versión posterior publicada por la Apache Software Foundation.

Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA; incluso sin la garantía implícita de 
COMERCIABILIDAD o ADECUACIÓN PARA UN PROPÓSITO PARTICULAR. Leer la Licencia Apache para más detalles.

En este repo hay disponible una copia de la Licencia Apache. Si no, ver <http://www.apache.org/licenses/LICENSE-2.0>.
