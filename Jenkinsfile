pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'gradlew build --info'
            }
        }
        
	     stage ('Unit Tests') {
			steps {
						
				sh 'gradle test'
						
			}
		}
      
    }
}