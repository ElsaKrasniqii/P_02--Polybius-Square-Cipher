# P_02 – Polybius 

Ky projekt është një implementim në gjuhën **Java** i algoritmit klasik të njohur si **Polybius**. Projekti mund të enkriptojë dhe dekriptojë tekste bazuar në këtë metodë dhe përfshin edhe shembuj demonstrues.

##  Rreth algoritmit

Polybius përdor një **katror 5x5** për të zëvendësuar çdo shkronjë të alfabetit me një palë numrash që përfaqësojnë **rreshtin dhe kolonën** ku ndodhet shkronja.

**Shënim:** Në këtë implementim, shkronjat **I** dhe **J** trajtohen si të njëjta.

Shembull i katrorit të përdorur:

    1   2   3   4   5
1 | A   B   C   D   E
2 | F   G   H   I/J K
3 | L   M   N   O   P
4 | Q   R   S   T   U
5 | V   W   X   Y   Z

## Funksionalitetet dhe mënyra e përdorimit

# Funksionalitetet

Ky kod ofron mundësi të enkriptimit dhe dekriptimit të fjalëve të ndryshme përmes algoritmit Polybius Square Cipher.

- Enkriptim i tekstit  
- Dekriptim i tekstit të koduar  
- Shembuj demonstrues për testim  
- Mbështetje për hapësira në tekst  
- Mënyrë interaktive për përdoruesin në terminal

##  Si të ekzekutohet

-  Sigurohu që ke instaluar Java (JDK).
-  Hape projektin në një editor si IntelliJ IDEA, VS Code, ose përdor terminalin.
-  Kompilo dhe ekzekuto klasën `PolybiusSquareCipher.java`.

### Kompilimi nga terminali:

javac PolybiusSquareCipher.java PolybiusSquareEncrypt.java PolybiusSquareDecrypt.java PolybiusSquareExample.java
java PolybiusSquareCipher

## Shembull perdorimi

Kur programi fillon, do te te ofroje nje meny me opsionet:
1. Enkriptim
2. Dekriptim
3. Shfaq Shembujt
0. Dalje

Zgjedh dhe ndjek udhezimet per te futur tekstin.

##  Autori / Kontributi

Ky projekt eshte zhvilluar si pjese e nje kursi universitar ne programim ose siguri te te dhenave.

