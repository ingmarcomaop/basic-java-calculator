// This shows a simple build wrapper example, using the AnsiColor plugin.
	pipeline { 
	  agent any


		triggers { pollSCM('* * * * *') }
    	tools {
			 gradle "GRADLE"
			 
		 }
		 
				
        	
			stage ('Build code') {
				steps {
			
					sh 'gradle build'
					
				}
			}
			
			
			
						
			
		
	}