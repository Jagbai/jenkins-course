job('NodeJS example') {
    scm {
        git('git://github.com/Jagbai/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('James Agbai')
            node / gitConfigEmail('james.agbai@hotmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        bat("npm install")
    }
}
