pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
            				
				 withMaven(
						// Maven installation declared in the Jenkins "Global Tool Configuration"
						maven: 'M3',
						// Maven settings.xml file defined with the Jenkins Config File Provider Plugin
						// Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
						mavenSettingsConfig: 'my-maven-settings',
						mavenLocalRepo: '.repository') {
							  // Run the maven build
							  bat "mvn clean install"
				 
						}

            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}