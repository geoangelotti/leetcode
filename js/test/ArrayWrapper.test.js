const { expect, test } = require("@jest/globals");
const ArrayWrapper = require('../src/ArrayWrapper');

test("case 1", () => {
	const obj1 = new ArrayWrapper([1, 2]);
	const obj2 = new ArrayWrapper([3, 4]);
	expect(obj1 + obj2).toStrictEqual(10);
});

test("case 2", () => {
	const obj = new ArrayWrapper([23, 98, 42, 70]);
	expect(String(obj)).toStrictEqual("[23,98,42,70]");
});

test("case 3", () => {
	const obj1 = new ArrayWrapper([]);
	const obj2 = new ArrayWrapper([]);
	expect(obj1 + obj2).toStrictEqual(0);
});