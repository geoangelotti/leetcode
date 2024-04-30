const { expect, test } = require("@jest/globals");
const once = require("../src/OnlyOneCall");

test("case 1", () => {
	const fn = once((a,b,c) => (a + b + c));
	expect(fn(1, 2, 3)).toStrictEqual(6);
	expect(fn(2, 3, 6)).toBeUndefined();
});

test("case 2", () => {
	const fn = once((a,b,c) => (a * b * c));
	expect(fn(5, 7, 4)).toStrictEqual(140);
	expect(fn(2, 3, 6)).toBeUndefined();
	expect(fn(4, 6, 8)).toBeUndefined();
});