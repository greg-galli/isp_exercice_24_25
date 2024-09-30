### Système de gestion des imprimantes

Vous êtes chargé de concevoir un système de gestion pour plusieurs types d'imprimantes dans une entreprise. Certaines imprimantes sont des **imprimantes multifonctions** capables d'imprimer, de numériser et de faxer, tandis que d'autres sont des **imprimantes basiques** qui ne peuvent qu'imprimer.

L'objectif de cet exercice est de respecter le **principe de ségrégation des interfaces (ISP)**, qui stipule que les classes ne doivent pas être obligées d’implémenter des méthodes qu'elles n'utilisent pas. Autrement dit, chaque interface doit être aussi spécifique que possible afin que chaque implémentation n'ait que les méthodes nécessaires.

----------

### Instructions :

Refactorisez le code de ce projet afin de respecter le **principe de ségrégation des interfaces (ISP)**