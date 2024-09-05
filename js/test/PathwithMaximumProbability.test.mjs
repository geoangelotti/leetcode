import test from "node:test";
import { strict as assert } from "node:assert";
import maxProbability from "../src/PathwithMaximumProbability.mjs";

test("Path with Maximum Probability", async (t) => {
  await t.test("Connected graph 1", () => {
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
  await t.test("Connected graph 2", () => {
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
