const { expect, test } = require("@jest/globals");
const checkIfInstanceOf = require("../src/CheckIfInstanceOf");

test("case 1", () => {
	expect(checkIfInstanceOf(new Date, Date)).toBe(true);
});

test("case 2", () => {
	class Animal {};
	class Dog extends Animal {}
	expect(checkIfInstanceOf(new Dog(), Animal)).toBe(true);
});

test("case 3", () => {
	expect(checkIfInstanceOf(Date, Date)).toBe(false);
});

test("case 4", () => {
	expect(checkIfInstanceOf(5, Number)).toBe(true);
});