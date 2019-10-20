pipeline {
    agent any
    stages {
        
	     stage ('Unit Tests') {
			steps {
						
				bat 'gradlew test --info'
						
			}
		}
		
		stage('Build') {
            steps {
                bat 'gradlew build --info'
            }
        }
        
        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeLocal') {
                    
                    bat 'gradlew --info sonarqube -x test'
                    
                }

            }
        }
        
        
      
    }
}