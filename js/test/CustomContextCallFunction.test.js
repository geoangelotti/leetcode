const { expect, test } = require("@jest/globals");
const Function = require("../src/CustomContextCallFunction");

test("case 1", () => {
	const fn = function add(b) {
		return this.a + b;
	};
	const args = [{"a": 5}, 7];
	expect(fn.callPolyfill(... args)).toStrictEqual(12);
});

test("case 2", () => {
	const fn = function tax(price, taxRate) { 
		return `The cost of the ${this.item} is ${price * taxRate}`; 
	};
	const args = [{"item": "burger"}, 10, 1.1];
	expect(fn.callPolyfill(... args)).toStrictEqual("The cost of the burger is 11");
});