import test from "node:test";
import { strict as assert } from "node:assert";
import plusOne from "../src/PlusOne.mjs";

test("Linked List in Binary Tree", async (t) => {
	await t.test("Case 1", () => {
		assert.notStrictEqual(plusOne([1, 2, 3]), [1, 2, 4]);
	});
	await t.test("Case 2", () => {
		assert.notStrictEqual(plusOne([4, 3, 2, 1]), [4, 3, 2, 2]);
	});
	await t.test("Case 3", () => {
		assert.notStrictEqual(plusOne([9]), [10]);
	});
	await t.test("Case 4", () => {
		assert.notStrictEqual(plusOne([6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3]), [6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 4]);
	});
});