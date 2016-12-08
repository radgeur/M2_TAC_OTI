Le travail sur les exception a été fait dans le dossier money_js_qunit



Le reste du travail a été fait dans le dossier money_js_sinon_qunit:

Les erreurs vu dans money_js ont également été corriger ici.

L'erreur dans le test : "test equals sans stub" a été corriger en rajouter un restore pour la méthode equals du stub, par contre la méthode deepEqual renvoit toujours une erreur.

L'erreur présente de base dans le fichier calc.js a été résolu.
Le test pour vérifier que la devise est incompatible s'affiche a été implémentée
L'opération de soustraction a été implémentée avec les exceptions liés et le message s'affiche en rouge lorsqu'une exception est lancé.
Le texte s'affiche en rouge lorsqu'il y a une erreur

Test sur la soustraction + devises incompatibles + soustraction impossible effectués.

Utilisation de la fonction window.alert() dans les exceptions + test avec stub de l'appel de cette méthode lors du déclenchement des exceptions.
