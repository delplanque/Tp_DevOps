Tp_DevOps

lancer le script start.sh

Les sites v1,v2,v3 ont été testé et sont fonctionnels

Pour ce qui est de Jenkins et des tests 
les scripts groovy et les tests ont été implémenté

Pour jenkins il faut lancer la commande :

docker run -p 8080:8080 --rm -v jenkins_home:/var/jenkins_home --name jenkins jenkins/jenkins:lts

et crée un job qui va executé le script groovy contenant les tests fait avec phpunit.