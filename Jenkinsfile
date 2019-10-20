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
        
        
        stage('Quality Gate') {
				steps {
					script{
							timeout(time: 10, unit: 'MINUTES') { // Just in case something goes wrong, pipeline will be killed after a timeout
							def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
							if (qg.status != 'OK') {
								error "Pipeline aborted due to quality gate failure: ${qg.status}"
							}
						}
					}
				}
			}
        
      
    }
}