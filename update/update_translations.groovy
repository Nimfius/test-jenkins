def call(){
	region = GetRegion()
	stage('my stage'){
		agent any
		steps{
			echo "Deploying on ${region} region"
		}
	}
}

def GetRegion() {
	if ( params.DisasterRecoveryMode ){
		return "eu-central-1"
	}
	else {
		return "eu-west-1"
	}
}