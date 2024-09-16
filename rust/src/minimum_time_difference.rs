#![allow(dead_code)]

fn find_min_difference(time_points: Vec<String>) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec!["23:59".to_string(), "00:00".to_string()], 1)]
    #[case(vec!["00:00".to_string(), "23:59".to_string(), "00:00".to_string()], 0)]
    fn test_find_min_difference(#[case] s: Vec<String>, #[case] expected: i32) {
        let result = find_min_difference(s);
        assert_eq!(result, expected);
    }
}
