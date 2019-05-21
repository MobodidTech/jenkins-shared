def copy(relativePath, to) {
	sh "cp -R $relativePath $to"
}
