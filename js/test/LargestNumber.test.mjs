import test from "node:test";
import { strict as assert } from "node:assert";
import largestNumber from "../src/LargestNumber.mjs";

test("Return the Largest Number", async (t) => {
	await t.test("Case 1", () => {
		assert.strictEqual(largestNumber([10, 2]), "210");
	});

	await t.test("Case 2", () => {
		assert.strictEqual(largestNumber([3, 30, 34, 5, 9]), "9534330");
	});
});