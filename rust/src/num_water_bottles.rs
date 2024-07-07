#![allow(dead_code)]
fn num_water_bottles(num_bottles: i32, num_exchange: i32) -> i32 {
    num_bottles + (num_bottles - 1) / (num_exchange - 1)
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(9, 3, 13)]
    #[case(15, 4, 19)]
    fn test_num_water_bottles(
        #[case] num_bottles: i32,
        #[case] num_exchange: i32,
        #[case] expected: i32,
    ) {
        let result = num_water_bottles(num_bottles, num_exchange);
        assert_eq!(result, expected);
    }
}
