/**
* @return {Function}
*/
var createHelloWorld = function () {
	const message = "Hello World";
	// eslint-disable-next-line no-unused-vars
	return function (...args) {
		return message;
	}
};

module.exports = createHelloWorld;