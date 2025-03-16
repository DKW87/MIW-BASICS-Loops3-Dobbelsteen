# Programming –opdracht Loops 3 - Dobbelsteen

## Beschrijving
Schrijf een applicatie die herhaaldelijk een dobbelsteen gooit totdat zes wordt gegooid. Na iedere worp moet de waarde afgedrukt worden als een "tekening" (zie voorbeeld). Bij de start van de applicatie moet de gebruiker gevraagd worden welk karakter gebruikt moet worden als oog van de dobbelsteen in de tekening.

Hier volgen twee voorbeelden van input/output van deze applicatie. Input die de gebruiker invoert is schuin en onderstreept.

In het eerste voorbeeld wordt achtereenvolgens 2 en 6 gegooid.

```
Welk karakter moet ik gebruiken voor het oog: *
*   *

*   *
*   *
```

In het tweede voorbeeld wordt achtereenvolgens 5, 5, 3 en 6 gegooid.

```
Welk karakter moet ik gebruiken voor het oog: #
#   #
  #  
#   #

#   #
  #  
#   #

#   #
  #  
    

#   #
#   #
#   #
```

## Hints
1. Schrijf eerst in pseudo-code op wat je programma moet doen, voordat je gaat programmeren.
2. De Scanner class heeft geen methode nextChar(). Maar je kan wel een String inlezen en vervolgens het eerste karakter daarvan opvragen.
3. Maak een methode int werpDobbelsteen() die een willekeurige worp van een dobbelsteen teruggeeft als geheel getal. Gebruik Math.random() om een worp te simuleren.
4. Maak een methode toonDobbelsteen(int mpWorp, char mpKarakter) die op basis van de worp en het karakter de juiste dobbelsteen print.

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7)