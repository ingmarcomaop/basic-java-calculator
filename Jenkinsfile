// This shows a simple build wrapper example, using the AnsiColor plugin.
	pipeline { 
	  agent any


		triggers { pollSCM('* * * * *') }
    	tools {
			 gradle "gradle_6.0"
			 
		 }
		 
				
        	
			stage ('Build code') {
				steps {
			
					bat 'gradle build'
					
				}
			}
			
			
			
						
			
		
	}