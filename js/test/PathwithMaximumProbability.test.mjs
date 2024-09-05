import test from "node:test";
import { strict as assert } from "node:assert";
import maxProbability from "../src/PathwithMaximumProbability.mjs";

test("To Be Or Not To Be", async (t) => {
  await t.test("Connected graph", () => {
    assert.strictEqual(
      maxProbability(
        3,
        [
          [0, 1],
          [1, 2],
          [0, 2],
        ],
        [0.5, 0.5, 0.2],
        0,
        2
      ),
      0.25
    );
  });
  await t.test("Connected graph", () => {
    assert.strictEqual(
      maxProbability(
        3,
        [
          [0, 1],
          [1, 2],
          [0, 2],
        ],
        [0.5, 0.5, 0.3],
        0,
        2
      ),
      0.3
    );
  });
  await t.test("Disconnected graph", () => {
    assert.strictEqual(maxProbability(3, [[0, 1]], [0.5], 0, 2), 0);
  });
});
