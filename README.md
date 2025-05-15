# 🔐 Message Decryptor (Java)

Ce projet est un petit challenge de déchiffrement de texte implémenté en Java. Il s'agit de décoder une chaîne de caractères suivant une logique bien définie : expansion des lettres selon des chiffres adjacents et inversion de l'ordre des mots.

## 🧠 Énoncé du Challenge

Une phrase a été cryptée avec la logique suivante :

1. **Les mots de la phrase ont été inversés**.
   - Exemple : `"welcome to hackerrank"` devient `"hackerrank to welcome"`

2. **Dans chaque mot, les lettres adjacentes répétées sont compressées au format** `<caractère><nombre>`.
   - Exemple : `"hel2o"` représente `"hello"`
   - `"a3b2"` représente `"aaabb"`

**Objectif** : Écrire un programme qui décrypte un tel message et retourne la phrase originale.

---

## ✅ Exemple

```java
Input  : "world hel2o"
Output : "hello world"
