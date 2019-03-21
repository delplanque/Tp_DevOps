job('Tp_Dev') {
    scm {
        git('https://github.com/delplanque/Tp_DevOps/',"v2") {  node -> 
            node / gitConfigName('J.delplanque')
            node / gitConfigEmail('delplanque.jordan@gmail.com')
        }
    }
    triggers {
        scm('H/60 * * * *')
    }
    wrappers {
        phpunit('Phpunit')
    }
    steps {
        shell("phpunit testPhp.php")
    }
}