75.10 - Técnicas de Diseño
Trabajo Práctico N°: 0

Agregado: jugada Fuego

Para agregar la nueva jugada tuve que realizar un cambio completo en todos los fuentes. La entrega anterior no estaba preparada para extenderse.
Me pareció una buena idea tener una clase que arbitre las partidas y delegarle la responsabilidad a ella.
Por lo tanto agregué una interfaz Move con el método vs pero también con un setter de jugadas que ganan a la jugada en cuestión. De esta manera cada clase que implemente Move deberá poder llenarse con las jugadas que lo vencen.
La única restricción que afloje fue la de utilizar operadores ternarios en la clase Referee.
Me pareció una buena idea utilizar Spring para inyectar las dependencias en los test, de esta manera los ganadores se configuran en un archivo xml en vez de realizarse en el código.
Utilizando esta inyección de dependencia me parece que TP es más flexible y puede extenderse y cambiar con más facilidad.
Decidí agregar javadocs a la interfaz y a la clase Referee.