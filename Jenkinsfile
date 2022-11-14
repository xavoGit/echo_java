pipeline {
    agent any
    tools {
        maven 'maven-3.6.3' 
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone repository') {
            steps {
                script{
                checkout scm
                }
            }
        }

        stage('Build') {
            steps {
				withMaven {
					sh "mvn clean package -Dmaven.test.skip=true"
				}
            }
        }
    }
}
