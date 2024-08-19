#![allow(dead_code)]

use std::collections::HashMap;
fn kth_distinct(arr: Vec<String>, k: i32) -> String {
    let mut frequencies: HashMap<String, i32> = HashMap::new();
    for s in arr.iter() {
        let count = frequencies.entry(s.to_string()).or_insert(0);
        *count += 1;
    }
    let mut c = 0;
    for s in arr.iter() {
        if frequencies[s] == 1 && c + 1 == k {
            return s.clone();
        }
        if frequencies[s] == 1 {
            c += 1;
        }
    }
    "".into()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![String::from("d"),
    String::from("b"),String::from("c").to_string(),String::from("b"),String::from("c"),String::from("a")],2, String::from("a"))]
    fn test_num_water_bottles(#[case] arr: Vec<String>, #[case] k: i32, #[case] expected: String) {
        let result = kth_distinct(arr, k);
        assert_eq!(result, expected);
    }
}
