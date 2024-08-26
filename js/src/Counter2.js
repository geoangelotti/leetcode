/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
	let c = init;
	return {
		increment: () => { return ++c },
		reset: () => { return c = init; },
		decrement: () => { return --c },
	};
};

module.exports = createCounter;