import requests
from bs4 import BeautifulSoup

try:
    # Ask the user for a web page URL
    url = input("Please enter the URL of the web page: ")

    # Download the web page content
    response = requests.get(url)

    # Check if the response was successful (status code 200)
    if response.status_code != 200:
        print(f"Failed to fetch the web page. Status code: {response.status_code}")
    else:
        # Parse the HTML content using BeautifulSoup
        soup = BeautifulSoup(response.text, 'html.parser')

        # Find all the links on the page
        links = soup.find_all('a')

        # Initialize an empty list to store link status
        link_status = []

        # Check the status of each link
        for link in links:
            link_url = link.get('href')
            if not link_url:
                link_status.append("Broken")
            else:
                link_response = requests.get(link_url)
                if link_response.status_code == 200:
                    link_status.append("Good")
                else:
                    link_status.append("Broken")

        # Print the list of links with their statuses
        for i in range(len(links)):
            print(f"Link name {i + 1}: {link_status[i]}")
except Exception as e:
    print(f"An error occurred: {e}")
