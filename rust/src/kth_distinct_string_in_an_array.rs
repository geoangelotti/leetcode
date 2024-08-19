#![allow(dead_code)]
fn kth_distinct(arr: Vec<String>, k: i32) -> String {
    todo!()
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
