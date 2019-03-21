job('Tp_Dev') {
    scm {
        git('https://github.com/delplanque/Tp_DevOps/',"v1") {  node -> 
            node / gitConfigName('J.delplanque')
            node / gitConfigEmail('delplanque.jordan@gmail.com')
        }
    }
    triggers {
        scm('H/60 * * * *')
    }
    wrappers {
        nodejs('NodeJS9')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}