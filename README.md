# Exercici 1 - Producte, Venda i Excepcions

📄 **Descripció - Enunciat de l'exercici**

Crea una classe anomenada `Producte` amb els atributs `nom` i `preu`, i una altra classe anomenada `Venda`.  
Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe `Venda` té un mètode anomenat `calcularTotal()` que llança l’excepció personalitzada `VendaBuidaException` i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida.  

Si la col·lecció té productes, llavors ha de recórrer-la i guardar la suma de tots els preus dels productes a l’atribut `preuTotal` de la venda.

L’excepció personalitzada `VendaBuidaException` ha de ser filla de la classe `Exception`. Al seu constructor li hem de passar el missatge “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode `getMessage()`.

A més, s’ha d’escriure el codi necessari per a generar i capturar una excepció de tipus `IndexOutOfBoundsException`.

---

💻 Tecnologies Utilitzades

- Java SE 21 (o superior)
- IDE (IntelliJ IDEA)
- Terminal per a compilar i executar amb javac i java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

---

🛠️ Instal·lació

1. Clona aquest repositori:
   git clone <URL-del-repositori>
2. Accedeix al directori del projecte:
   cd n1exercici1
3. Comprova que tens Java instal·lat:
   java -version

-----------------------------------

▶️ Execució

1. Compila els arxius Java (des de l’arrel del projecte):
   mkdir -p out
   javac -d out src/n1exercici1/*.java
3. Executa la classe principal:
   java -cp out n1exercici1.N1Exercici1

🌐 Desplegament

Per desplegar el projecte en un entorn de producció o servidor:
1. Empaqueta el projecte en un .jar:
   jar --create --file n1exercici1.jar --main-class n1exercici1.N1Exercici1 -C out .
2. Puja l’arxiu .jar al servidor.
3. Executa’l amb:
   java -jar n1exercici1.jar

🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja’ls:
   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:
   git push origin feature/NovaFuncionalitat
5. Fes un pull request.
