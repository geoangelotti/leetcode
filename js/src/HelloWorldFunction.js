/**
* @return {Function}
*/
var createHelloWorld = function() {
	const message = "Hello World";
	return function(...args) {
		return message;
	}
};

module.exports = createHelloWorld;