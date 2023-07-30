pipeline {
    agent any
    stages {
        stage('check version of git, maven,java') {
            steps {
			        sh('git --version')
                    sh('mvn -v')
                    sh('java --version')					
               
            }
        }
        stage('code complilation and packaging') {
            steps {
                    sh('mvn clean package') 
            }
        }
        
    }
}