package com.mobodid.shared

class shared {
	def logHelloWorld() {
		sh 'echo "hello world"'
	}
}

def printHello() {
	sh 'echo "hello world from library"'
}



