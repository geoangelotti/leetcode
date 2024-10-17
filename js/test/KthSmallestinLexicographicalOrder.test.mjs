import test from "node:test";
import { strict as assert } from "node:assert";
import findKthNumber from "../src/KthSmallestinLexicographicalOrder.mjs";

test("Return the Largest Number", async (t) => {
  await t.test("Case 1", () => {
    assert.strictEqual(findKthNumber(13, 2), 10);
  });

  await t.test("Case 2", () => {
    assert.strictEqual(findKthNumber(1, 1), 1);
  });
});
